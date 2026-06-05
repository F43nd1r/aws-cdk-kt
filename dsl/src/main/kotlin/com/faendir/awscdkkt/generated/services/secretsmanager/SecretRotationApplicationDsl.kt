package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication

@Generated
public fun buildSecretRotationApplication(
  applicationName: String,
  awsSemanticVersion: String,
  initializer: @AwsCdkDsl SecretRotationApplication.Builder.() -> Unit = {},
): SecretRotationApplication = SecretRotationApplication.Builder.create(applicationName, awsSemanticVersion).apply(initializer).build()
