package com.faendir.awscdkkt.generated.services.s3.deployment

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
import software.constructs.Construct

@Generated
public fun Construct.deployTimeSubstitutedFile(id: String, props: DeployTimeSubstitutedFileProps):
    DeployTimeSubstitutedFile = DeployTimeSubstitutedFile(this, id, props)

@Generated
public fun Construct.deployTimeSubstitutedFile(
  id: String,
  props: DeployTimeSubstitutedFileProps,
  initializer: @AwsCdkDsl DeployTimeSubstitutedFile.() -> Unit,
): DeployTimeSubstitutedFile = DeployTimeSubstitutedFile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDeployTimeSubstitutedFile(id: String, initializer: @AwsCdkDsl
    DeployTimeSubstitutedFile.Builder.() -> Unit): DeployTimeSubstitutedFile =
    DeployTimeSubstitutedFile.Builder.create(this, id).apply(initializer).build()
