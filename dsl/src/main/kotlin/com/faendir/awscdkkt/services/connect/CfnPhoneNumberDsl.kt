@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnPhoneNumber
import software.amazon.awscdk.services.connect.CfnPhoneNumberProps
import software.constructs.Construct

public fun Construct.cfnPhoneNumber(
  id: String,
  props: CfnPhoneNumberProps,
  initializer: CfnPhoneNumber.() -> Unit = {},
): CfnPhoneNumber = CfnPhoneNumber(this, id, props).apply(initializer)
