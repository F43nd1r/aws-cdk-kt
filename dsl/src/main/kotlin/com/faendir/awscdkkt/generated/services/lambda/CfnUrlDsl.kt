package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnUrlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUrl(
  id: String,
  props: CfnUrlProps,
  initializer: @AwsCdkDsl CfnUrl.() -> Unit = {},
): CfnUrl = CfnUrl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUrl(id: String, initializer: @AwsCdkDsl CfnUrl.Builder.() -> Unit =
    {}): CfnUrl = CfnUrl.Builder.create(this, id).apply(initializer).build()
