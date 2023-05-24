package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication

@Generated
public fun buildSecretRotationApplication(
  applicationId: String,
  semanticVersion: String,
  initializer: @AwsCdkDsl SecretRotationApplication.Builder.() -> Unit,
): SecretRotationApplication = SecretRotationApplication.Builder.create(applicationId,
    semanticVersion).apply(initializer).build()
