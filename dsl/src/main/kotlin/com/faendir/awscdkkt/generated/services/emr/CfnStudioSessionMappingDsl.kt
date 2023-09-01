package com.faendir.awscdkkt.generated.services.emr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnStudioSessionMapping
import software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStudioSessionMapping(
  id: String,
  props: CfnStudioSessionMappingProps,
  initializer: @AwsCdkDsl CfnStudioSessionMapping.() -> Unit = {},
): CfnStudioSessionMapping = CfnStudioSessionMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStudioSessionMapping(id: String, initializer: @AwsCdkDsl
    CfnStudioSessionMapping.Builder.() -> Unit = {}): CfnStudioSessionMapping =
    CfnStudioSessionMapping.Builder.create(this, id).apply(initializer).build()
