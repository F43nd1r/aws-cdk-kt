package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun hlsMediaStoreSettingsProperty(initializer: CfnChannel.HlsMediaStoreSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.HlsMediaStoreSettingsProperty =
    CfnChannel.HlsMediaStoreSettingsProperty.builder().apply(initializer).build()
