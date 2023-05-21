package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public
    fun bucketsAndRegionsProperty(initializer: CfnStorageLens.BucketsAndRegionsProperty.Builder.() -> Unit
    = {}): CfnStorageLens.BucketsAndRegionsProperty =
    CfnStorageLens.BucketsAndRegionsProperty.builder().apply(initializer).build()
