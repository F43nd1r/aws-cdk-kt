package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.OriginGroup
import software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps

@Generated
public fun originGroup(props: OriginGroupProps): OriginGroup = OriginGroup(props)

@Generated
public fun buildOriginGroup(initializer: @AwsCdkDsl OriginGroup.Builder.() -> Unit): OriginGroup =
    OriginGroup.Builder.create().apply(initializer).build()
