package com.faendir.awscdkkt.generated.services.smsvoice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.smsvoice.CfnSenderId
import software.amazon.awscdk.services.smsvoice.CfnSenderIdProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSenderId(
  id: String,
  props: CfnSenderIdProps,
  initializer: @AwsCdkDsl CfnSenderId.() -> Unit = {},
): CfnSenderId = CfnSenderId(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSenderId(id: String, initializer: @AwsCdkDsl CfnSenderId.Builder.() -> Unit = {}): CfnSenderId = CfnSenderId.Builder.create(this, id).apply(initializer).build()
