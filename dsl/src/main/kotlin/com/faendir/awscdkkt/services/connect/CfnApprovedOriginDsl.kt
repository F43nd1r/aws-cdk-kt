@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnApprovedOrigin
import software.amazon.awscdk.services.connect.CfnApprovedOriginProps
import software.constructs.Construct

public fun Construct.cfnApprovedOrigin(
  id: String,
  props: CfnApprovedOriginProps,
  initializer: CfnApprovedOrigin.() -> Unit = {},
): CfnApprovedOrigin = CfnApprovedOrigin(this, id, props).apply(initializer)
