package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBasePathMapping(
  id: String,
  props: CfnBasePathMappingProps,
  initializer: @AwsCdkDsl CfnBasePathMapping.() -> Unit = {},
): CfnBasePathMapping = CfnBasePathMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBasePathMapping(id: String, initializer: @AwsCdkDsl
    CfnBasePathMapping.Builder.() -> Unit = {}): CfnBasePathMapping =
    CfnBasePathMapping.Builder.create(this, id).apply(initializer).build()
