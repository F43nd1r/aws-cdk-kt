package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.CloudFormationStackArtifact

@Generated
public fun buildCloudFormationStackArtifact(
  assembly: CloudAssembly,
  artifactId: String,
  initializer: @AwsCdkDsl CloudFormationStackArtifact.Builder.() -> Unit = {},
): CloudFormationStackArtifact = CloudFormationStackArtifact.Builder.create(assembly, artifactId).apply(initializer).build()
