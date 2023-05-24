package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnResource
import software.amazon.awscdk.services.apigateway.CfnResourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResource(id: String, props: CfnResourceProps): CfnResource =
    CfnResource(this, id, props)

@Generated
public fun Construct.cfnResource(
  id: String,
  props: CfnResourceProps,
  initializer: @AwsCdkDsl CfnResource.() -> Unit,
): CfnResource = CfnResource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResource(id: String, initializer: @AwsCdkDsl
    CfnResource.Builder.() -> Unit): CfnResource = CfnResource.Builder.create(this,
    id).apply(initializer).build()
