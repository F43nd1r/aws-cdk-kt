package com.faendir.awscdkkt.generated.services.smsvoice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.smsvoice.CfnPhoneNumber
import software.amazon.awscdk.services.smsvoice.CfnPhoneNumberProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPhoneNumber(
  id: String,
  props: CfnPhoneNumberProps,
  initializer: @AwsCdkDsl CfnPhoneNumber.() -> Unit = {},
): CfnPhoneNumber = CfnPhoneNumber(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPhoneNumber(id: String, initializer: @AwsCdkDsl CfnPhoneNumber.Builder.() -> Unit = {}): CfnPhoneNumber = CfnPhoneNumber.Builder.create(this, id).apply(initializer).build()
