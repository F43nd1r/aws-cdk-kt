@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps

@Deprecated(message =
    "software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps is deprecated in CDK.")
@Generated
public fun buildCustomLambdaDeploymentConfigProps(initializer: @AwsCdkDsl
    CustomLambdaDeploymentConfigProps.Builder.() -> Unit): CustomLambdaDeploymentConfigProps =
    CustomLambdaDeploymentConfigProps.Builder().apply(initializer).build()
