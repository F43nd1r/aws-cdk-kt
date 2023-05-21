package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.ArtifactManifest

@Generated
public fun artifactManifest(initializer: ArtifactManifest.Builder.() -> Unit = {}): ArtifactManifest
    = ArtifactManifest.builder().apply(initializer).build()
