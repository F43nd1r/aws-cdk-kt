package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnAuthorizer
import software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAuthorizer(id: String, props: CfnAuthorizerProps): CfnAuthorizer =
    CfnAuthorizer(this, id, props)

@Generated
public fun Construct.cfnAuthorizer(
  id: String,
  props: CfnAuthorizerProps,
  initializer: @AwsCdkDsl CfnAuthorizer.() -> Unit,
): CfnAuthorizer = CfnAuthorizer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAuthorizer(id: String, initializer: @AwsCdkDsl
    CfnAuthorizer.Builder.() -> Unit): CfnAuthorizer = CfnAuthorizer.Builder.create(this,
    id).apply(initializer).build()
