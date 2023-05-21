package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun archiveContainerSettingsProperty(initializer: CfnChannel.ArchiveContainerSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.ArchiveContainerSettingsProperty =
    CfnChannel.ArchiveContainerSettingsProperty.builder().apply(initializer).build()
