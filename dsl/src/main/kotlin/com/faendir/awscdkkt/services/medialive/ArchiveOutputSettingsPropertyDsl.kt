package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun archiveOutputSettingsProperty(initializer: CfnChannel.ArchiveOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.ArchiveOutputSettingsProperty =
    CfnChannel.ArchiveOutputSettingsProperty.builder().apply(initializer).build()
