package com.faendir.awscdkkt.generated.services.paymentcryptography

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.paymentcryptography.CfnKey
import software.amazon.awscdk.services.paymentcryptography.CfnKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKey(
  id: String,
  props: CfnKeyProps,
  initializer: @AwsCdkDsl CfnKey.() -> Unit = {},
): CfnKey = CfnKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnKey(id: String, initializer: @AwsCdkDsl CfnKey.Builder.() -> Unit = {}): CfnKey = CfnKey.Builder.create(this, id).apply(initializer).build()
