package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public
    fun allowedStatisticsProperty(initializer: CfnJob.AllowedStatisticsProperty.Builder.() -> Unit =
    {}): CfnJob.AllowedStatisticsProperty =
    CfnJob.AllowedStatisticsProperty.builder().apply(initializer).build()
