package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnPhoneNumber
import software.amazon.awscdk.services.connect.CfnPhoneNumberProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPhoneNumber(
  id: String,
  props: CfnPhoneNumberProps,
  initializer: @AwsCdkDsl CfnPhoneNumber.() -> Unit = {},
): CfnPhoneNumber = CfnPhoneNumber(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPhoneNumber(id: String, initializer: @AwsCdkDsl CfnPhoneNumber.Builder.() -> Unit = {}): CfnPhoneNumber = CfnPhoneNumber.Builder.create(this, id).apply(initializer).build()
