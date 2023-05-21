package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public
    fun profileConfigurationProperty(initializer: CfnJob.ProfileConfigurationProperty.Builder.() -> Unit
    = {}): CfnJob.ProfileConfigurationProperty =
    CfnJob.ProfileConfigurationProperty.builder().apply(initializer).build()
