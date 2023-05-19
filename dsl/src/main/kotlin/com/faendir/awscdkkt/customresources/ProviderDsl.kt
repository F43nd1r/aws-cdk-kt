@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.customresources

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.customresources.Provider
import software.amazon.awscdk.customresources.ProviderProps
import software.constructs.Construct

public fun Construct.provider(
  id: String,
  props: ProviderProps,
  initializer: Provider.() -> Unit = {},
): Provider = Provider(this, id, props).apply(initializer)
