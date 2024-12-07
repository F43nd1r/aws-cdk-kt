package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnBasePathMappingV2(
  id: String,
  props: CfnBasePathMappingV2Props,
  initializer: @AwsCdkDsl CfnBasePathMappingV2.() -> Unit = {},
): CfnBasePathMappingV2 = CfnBasePathMappingV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBasePathMappingV2(id: String, initializer: @AwsCdkDsl
    CfnBasePathMappingV2.Builder.() -> Unit = {}): CfnBasePathMappingV2 =
    CfnBasePathMappingV2.Builder.create(this, id).apply(initializer).build()
