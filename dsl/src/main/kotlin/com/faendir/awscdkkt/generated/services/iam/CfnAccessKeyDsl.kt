package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.amazon.awscdk.services.iam.CfnAccessKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessKey(
  id: String,
  props: CfnAccessKeyProps,
  initializer: @AwsCdkDsl CfnAccessKey.() -> Unit = {},
): CfnAccessKey = CfnAccessKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessKey(id: String, initializer: @AwsCdkDsl
    CfnAccessKey.Builder.() -> Unit = {}): CfnAccessKey = CfnAccessKey.Builder.create(this,
    id).apply(initializer).build()
