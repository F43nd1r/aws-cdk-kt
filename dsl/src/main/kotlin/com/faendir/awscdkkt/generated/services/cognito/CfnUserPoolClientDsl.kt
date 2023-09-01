package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolClient(
  id: String,
  props: CfnUserPoolClientProps,
  initializer: @AwsCdkDsl CfnUserPoolClient.() -> Unit = {},
): CfnUserPoolClient = CfnUserPoolClient(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolClient(id: String, initializer: @AwsCdkDsl
    CfnUserPoolClient.Builder.() -> Unit = {}): CfnUserPoolClient =
    CfnUserPoolClient.Builder.create(this, id).apply(initializer).build()
