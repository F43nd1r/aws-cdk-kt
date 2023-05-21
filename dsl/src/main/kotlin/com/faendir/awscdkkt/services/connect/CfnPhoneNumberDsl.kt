package com.faendir.awscdkkt.services.connect

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
  initializer: CfnPhoneNumber.() -> Unit = {},
): CfnPhoneNumber = CfnPhoneNumber(this, id, props).apply(initializer)
