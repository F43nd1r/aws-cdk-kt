package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun buildVpcConfigProperty(initializer: @AwsCdkDsl
    CfnProject.VpcConfigProperty.Builder.() -> Unit): CfnProject.VpcConfigProperty =
    CfnProject.VpcConfigProperty.Builder().apply(initializer).build()
