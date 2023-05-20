@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.SamlProvider
import software.amazon.awscdk.services.iam.SamlProviderProps
import software.constructs.Construct

public fun Construct.samlProvider(
  id: String,
  props: SamlProviderProps,
  initializer: SamlProvider.() -> Unit = {},
): SamlProvider = SamlProvider(this, id, props).apply(initializer)
