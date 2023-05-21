package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps

@Generated
public
    fun customActionRegistrationProps(initializer: CustomActionRegistrationProps.Builder.() -> Unit
    = {}): CustomActionRegistrationProps =
    CustomActionRegistrationProps.builder().apply(initializer).build()
