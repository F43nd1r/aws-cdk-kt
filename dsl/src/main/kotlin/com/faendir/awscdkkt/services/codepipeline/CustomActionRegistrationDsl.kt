@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CustomActionRegistration
import software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps
import software.constructs.Construct

public fun Construct.customActionRegistration(
  id: String,
  props: CustomActionRegistrationProps,
  initializer: CustomActionRegistration.() -> Unit = {},
): CustomActionRegistration = CustomActionRegistration(this, id, props).apply(initializer)
