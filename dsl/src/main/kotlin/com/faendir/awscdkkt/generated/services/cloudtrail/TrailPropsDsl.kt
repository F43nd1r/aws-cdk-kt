package com.faendir.awscdkkt.generated.services.cloudtrail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.TrailProps

@Generated
public fun buildTrailProps(initializer: @AwsCdkDsl TrailProps.Builder.() -> Unit = {}): TrailProps =
    TrailProps.Builder().apply(initializer).build()
