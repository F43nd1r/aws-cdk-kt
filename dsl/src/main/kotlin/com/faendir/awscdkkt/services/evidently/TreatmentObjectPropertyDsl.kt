package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnExperiment

@Generated
public
    fun treatmentObjectProperty(initializer: CfnExperiment.TreatmentObjectProperty.Builder.() -> Unit
    = {}): CfnExperiment.TreatmentObjectProperty =
    CfnExperiment.TreatmentObjectProperty.builder().apply(initializer).build()
