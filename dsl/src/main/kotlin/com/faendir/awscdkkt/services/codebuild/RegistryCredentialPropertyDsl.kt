package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun registryCredentialProperty(initializer: CfnProject.RegistryCredentialProperty.Builder.() -> Unit
    = {}): CfnProject.RegistryCredentialProperty =
    CfnProject.RegistryCredentialProperty.builder().apply(initializer).build()
