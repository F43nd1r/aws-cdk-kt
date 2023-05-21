package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public
    fun validationConfigurationProperty(initializer: CfnJob.ValidationConfigurationProperty.Builder.() -> Unit
    = {}): CfnJob.ValidationConfigurationProperty =
    CfnJob.ValidationConfigurationProperty.builder().apply(initializer).build()
