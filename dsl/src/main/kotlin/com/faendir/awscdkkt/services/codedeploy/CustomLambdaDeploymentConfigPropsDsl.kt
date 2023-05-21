@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps

@Deprecated(message =
    "software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps is deprecated in CDK.")
@Generated
public
    fun customLambdaDeploymentConfigProps(initializer: CustomLambdaDeploymentConfigProps.Builder.() -> Unit
    = {}): CustomLambdaDeploymentConfigProps =
    CustomLambdaDeploymentConfigProps.builder().apply(initializer).build()
