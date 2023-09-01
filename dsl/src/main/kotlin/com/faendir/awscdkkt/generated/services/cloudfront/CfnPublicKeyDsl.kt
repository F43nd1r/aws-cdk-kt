package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicKey(
  id: String,
  props: CfnPublicKeyProps,
  initializer: @AwsCdkDsl CfnPublicKey.() -> Unit = {},
): CfnPublicKey = CfnPublicKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPublicKey(id: String, initializer: @AwsCdkDsl
    CfnPublicKey.Builder.() -> Unit = {}): CfnPublicKey = CfnPublicKey.Builder.create(this,
    id).apply(initializer).build()
