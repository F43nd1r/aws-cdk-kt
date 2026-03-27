package com.faendir.awscdkkt.generated.services.route53globalresolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53globalresolver.CfnAccessToken
import software.amazon.awscdk.services.route53globalresolver.CfnAccessTokenProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessToken(
  id: String,
  props: CfnAccessTokenProps,
  initializer: @AwsCdkDsl CfnAccessToken.() -> Unit = {},
): CfnAccessToken = CfnAccessToken(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessToken(id: String, initializer: @AwsCdkDsl CfnAccessToken.Builder.() -> Unit = {}): CfnAccessToken = CfnAccessToken.Builder.create(this, id).apply(initializer).build()
