package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnExperiment

@Generated
public
    fun treatmentToWeightProperty(initializer: CfnExperiment.TreatmentToWeightProperty.Builder.() -> Unit
    = {}): CfnExperiment.TreatmentToWeightProperty =
    CfnExperiment.TreatmentToWeightProperty.builder().apply(initializer).build()
