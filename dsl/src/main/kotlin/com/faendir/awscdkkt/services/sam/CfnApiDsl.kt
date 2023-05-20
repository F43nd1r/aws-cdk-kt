@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi
import software.amazon.awscdk.services.sam.CfnApiProps
import software.constructs.Construct

public fun Construct.cfnApi(
  id: String,
  props: CfnApiProps,
  initializer: CfnApi.() -> Unit = {},
): CfnApi = CfnApi(this, id, props).apply(initializer)
