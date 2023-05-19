@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi
import software.amazon.awscdk.services.sam.CfnHttpApiProps
import software.constructs.Construct

public fun Construct.cfnHttpApi(id: String, initializer: CfnHttpApi.() -> Unit = {}): CfnHttpApi =
    CfnHttpApi(this, id).apply(initializer)

public fun Construct.cfnHttpApi(
  id: String,
  props: CfnHttpApiProps,
  initializer: CfnHttpApi.() -> Unit = {},
): CfnHttpApi = CfnHttpApi(this, id, props).apply(initializer)
