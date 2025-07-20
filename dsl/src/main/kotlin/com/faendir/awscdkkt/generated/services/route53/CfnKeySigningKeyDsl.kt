package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.amazon.awscdk.services.route53.CfnKeySigningKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKeySigningKey(
  id: String,
  props: CfnKeySigningKeyProps,
  initializer: @AwsCdkDsl CfnKeySigningKey.() -> Unit = {},
): CfnKeySigningKey = CfnKeySigningKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnKeySigningKey(id: String, initializer: @AwsCdkDsl CfnKeySigningKey.Builder.() -> Unit = {}): CfnKeySigningKey = CfnKeySigningKey.Builder.create(this, id).apply(initializer).build()
