package org.lamisplus.modules.hiv.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.lamisplus.modules.hiv.utility.LocalDateConverter;
import org.lamisplus.modules.patient.domain.dto.VitalSignDto;

import javax.persistence.Convert;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ARTClinicVisitDto implements Serializable {
    @Type(type = "jsonb")
    JsonNode adverseDrugReactions;
    private Long id;
    @Convert(converter = LocalDateConverter.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate visitDate;
    private String cd4;
    private Long cd4Percentage;
    @JsonIgnore
    private Boolean isCommencement;
    private Long functionalStatusId;
    private String clinicalNote;
    private String uuid;
    private Long hivEnrollmentId;
    private Long artStatusId;
    private Long whoStagingId;
    @NotNull
    private VitalSignDto vitalSignDto;
    @NotNull
    private Long facilityId;
    @NotNull
    private Long personId;
    @NotNull
    private Long clinicalStageId;
    private String oiScreened;
    private String stiIds;
    private String stiTreated;
    @Type(type = "jsonb")
    private JsonNode adheres;
    private String adrScreened;
    private String adherenceLevel;
    @Type(type = "jsonb")
    private JsonNode opportunisticInfections;
    @Type(type = "jsonb")
    private JsonNode TbScreen;
    @Convert(converter = LocalDateConverter.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @PastOrPresent
    private LocalDate nextAppointment;
    @PastOrPresent
    @Convert(converter = LocalDateConverter.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate lmpDate;


}
