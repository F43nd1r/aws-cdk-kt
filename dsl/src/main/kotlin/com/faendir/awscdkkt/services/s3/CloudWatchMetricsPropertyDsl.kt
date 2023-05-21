package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public
    fun cloudWatchMetricsProperty(initializer: CfnStorageLens.CloudWatchMetricsProperty.Builder.() -> Unit
    = {}): CfnStorageLens.CloudWatchMetricsProperty =
    CfnStorageLens.CloudWatchMetricsProperty.builder().apply(initializer).build()
