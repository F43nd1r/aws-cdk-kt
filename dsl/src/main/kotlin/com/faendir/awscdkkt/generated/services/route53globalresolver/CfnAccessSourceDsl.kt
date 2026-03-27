package com.faendir.awscdkkt.generated.services.route53globalresolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53globalresolver.CfnAccessSource
import software.amazon.awscdk.services.route53globalresolver.CfnAccessSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessSource(
  id: String,
  props: CfnAccessSourceProps,
  initializer: @AwsCdkDsl CfnAccessSource.() -> Unit = {},
): CfnAccessSource = CfnAccessSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessSource(id: String, initializer: @AwsCdkDsl CfnAccessSource.Builder.() -> Unit = {}): CfnAccessSource = CfnAccessSource.Builder.create(this, id).apply(initializer).build()
