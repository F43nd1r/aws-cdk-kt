package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun vpcConfigProperty(initializer: CfnProject.VpcConfigProperty.Builder.() -> Unit = {}):
    CfnProject.VpcConfigProperty = CfnProject.VpcConfigProperty.builder().apply(initializer).build()
