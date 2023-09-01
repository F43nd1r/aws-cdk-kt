package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.amazon.awscdk.services.lambda.CfnLayerVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayerVersion(
  id: String,
  props: CfnLayerVersionProps,
  initializer: @AwsCdkDsl CfnLayerVersion.() -> Unit = {},
): CfnLayerVersion = CfnLayerVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLayerVersion(id: String, initializer: @AwsCdkDsl
    CfnLayerVersion.Builder.() -> Unit = {}): CfnLayerVersion = CfnLayerVersion.Builder.create(this,
    id).apply(initializer).build()
