package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CustomActionRegistration.() -> Unit = {},
): CustomActionRegistration = CustomActionRegistration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCustomActionRegistration(id: String, initializer: @AwsCdkDsl CustomActionRegistration.Builder.() -> Unit = {}): CustomActionRegistration = CustomActionRegistration.Builder.create(this, id).apply(initializer).build()
