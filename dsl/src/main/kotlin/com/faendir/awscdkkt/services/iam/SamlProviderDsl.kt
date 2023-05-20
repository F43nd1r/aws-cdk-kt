@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
