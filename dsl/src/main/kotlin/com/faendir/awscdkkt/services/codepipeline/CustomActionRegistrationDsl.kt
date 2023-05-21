package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CustomActionRegistration
import software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps
import software.constructs.Construct

@Generated
public fun Construct.customActionRegistration(
  id: String,
  props: CustomActionRegistrationProps,
  initializer: CustomActionRegistration.() -> Unit = {},
): CustomActionRegistration = CustomActionRegistration(this, id, props).apply(initializer)
