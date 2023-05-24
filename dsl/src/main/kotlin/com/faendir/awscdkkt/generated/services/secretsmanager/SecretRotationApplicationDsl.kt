package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions

@Generated
public fun secretRotationApplication(
  applicationId: String,
  semanticVersion: String,
  options: SecretRotationApplicationOptions,
): SecretRotationApplication = SecretRotationApplication(applicationId, semanticVersion, options)

@Generated
public fun secretRotationApplication(applicationId: String, semanticVersion: String):
    SecretRotationApplication = SecretRotationApplication(applicationId, semanticVersion)

@Generated
public fun buildSecretRotationApplication(
  applicationId: String,
  semanticVersion: String,
  initializer: @AwsCdkDsl SecretRotationApplication.Builder.() -> Unit,
): SecretRotationApplication = SecretRotationApplication.Builder.create(applicationId,
    semanticVersion).apply(initializer).build()
