package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public
    fun activityMetricsProperty(initializer: CfnStorageLens.ActivityMetricsProperty.Builder.() -> Unit
    = {}): CfnStorageLens.ActivityMetricsProperty =
    CfnStorageLens.ActivityMetricsProperty.builder().apply(initializer).build()
